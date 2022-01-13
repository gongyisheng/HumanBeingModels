import React from "react";
import { Route, Routes } from 'react-router-dom';
import '../router/config';

import { Box,Grid } from "grommet";

import Console from "./Console";
import Footer from "./Footer";
import axios from "axios";

class Main extends React.Component {

  render(){
    const Dashboard = global._Dashboard;
    const Document = global._Document;
    const AboutMe = global._AboutMe;
    //console.log(this.state.data);
    return (
      <Grid
        columns={['flex','auto']}
        rows={['flex','xxsmall']}
        areas={[
          { name: 'body', start: [0, 0], end: [0, 0]},
          { name: 'console', start: [1, 0], end: [1, 1] },
          { name: 'footer', start: [0, 1], end: [0, 1] }
        ]}
      >
        <Box gridArea="body" background={this.props.bodyColor}>
          <Routes>
            <Route path='/' element={<Dashboard data={this.props.data}/>}/>
            <Route path='/socialNetwork/dashboard' element={<Dashboard data={this.props.data}/>}/>
            <Route path='/socialNetwork/document' element={<Document/>}/>
            <Route path='/socialNetwork/aboutMe' element={<AboutMe/>}/>
          </Routes>
        </Box>
        <Box gridArea="console" background={this.props.consoleColor}>
          <Console hoverColor={this.props.hoverColor}
                   handleRun={this.props.handleRun} handleResetData={this.props.initData} token={this.props.token} websocket={this.props.websocket}/>
        </Box>
        <Box gridArea="footer" background={this.props.bodyColor}>
          <Footer/>
        </Box>
      </Grid>
    )
  }
}

export default Main;
