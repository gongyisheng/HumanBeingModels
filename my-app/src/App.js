import React from "react";
import './App.css';
import Nav from './components/Nav';
import Main from './components/Main';
import uuid from "./util/tool";
import axios from "axios";
import { Grid, Box ,Grommet } from 'grommet';
//global variables
import './main';


axios.defaults.baseURL = process.env["REACT_APP_BASE_URL"];

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      token: uuid(10),
      websocket: undefined,
      data: {
        average_score: [],
        exchange_num: [],
        turning_point: 0,
      },
    };
    this.initData = this.initData.bind(this);
  }
  //websocket
  onOpen = (websocket) => {
    console.log('WebSocket连接成功，状态码：', websocket.target.readyState);
    console.log('token: ',this.state.token);
  };
  onMessage = (event) => {
    //console.log('WebSocket收到消息：', event.data);
    const { average_score,exchange_num, } = this.state.data;
    const arr = event.data.split("#");
    for(let i=0;i<arr.length;i++){
      const [ x,score,num ] = arr[i].split(",");
      average_score[Number.parseInt(x)] = {x:Number.parseInt(x),y:Number.parseFloat(score)};
      exchange_num[Number.parseInt(x)] = {x:Number.parseInt(x),y:Number.parseInt(num)};
    }
    this.setState({
      data: {
        average_score: average_score,
        exchange_num: exchange_num,
      }
    });
  };
  onError = (websocket) => {
    console.log('WebSocket连接错误，状态码：', websocket.target.readyState)
  };
  onClose = (websocket) => {
    console.log('WebSocket连接关闭，状态码：', websocket.target.readyState)
  };

  initWebSocket = (websocket) => {
    // 连接成功
    websocket.onopen = this.onOpen;
    // 收到消息的回调
    websocket.onmessage = this.onMessage;
    // 连接错误
    websocket.onerror = this.onError;
    // 连接关闭的回调
    websocket.onclose = this.onClose;
  };

  initData(rounds){
    const array1 = [];
    const array2 = [];
    for(let i=0;i<rounds;i++){
      array1.push({x:i,y:null});
      array2.push({x:i,y:null});
    }
    console.log("initData: ",rounds);
    this.setState({
      data: {
        average_score: array1,
        exchange_num: array2,
        turning_point: 0,
      },
    });
  }

  componentDidMount() {
    if ('WebSocket' in window) {
      //Address  ws://127.0.0.1:8880/ws/xxx
      let websocket = new WebSocket(process.env.REACT_APP_WS_SERVER + '/ws/' + this.state.token);
      this.initWebSocket(websocket);
      this.setState({
        websocket: websocket,
      });
    } else {
      alert("Your browser version is too old! Please upgrade your browser to the latest version, or use a different browser.");
    }
  }

  render(){
  return (
    <div>
    <Grommet plain>
      <Grid
        columns={['small', 'flex']}
        rows={['flex']}
        areas={[
          { name: 'nav', start: [0, 0], end: [0, 0] },
          { name: 'main', start: [1, 0], end: [1, 0] },
        ]}
      >
        <Box gridArea="nav" background="dark-1">
          <Nav backgroundColor="dark-1" clickedColor="brand" hoverColor="dark-5"/>
        </Box>
        <Box gridArea="main" background="light-2">
          <Main bodyColor="light-2" consoleColor="dark-1" hoverColor="dark-5"
                websocket={this.state.websocket} token={this.state.token} data={this.state.data} initData={this.initData}/>
        </Box>
      </Grid>
    </Grommet>
    </div>
  )
  }
}

export default App;
