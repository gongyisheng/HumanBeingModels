import React from "react";
import '../main';
import {Box,Text,Grid} from "grommet";
import {VictoryChart, VictoryLine, VictoryTooltip, VictoryVoronoiContainer} from "victory"

class RealTimeChart extends React.Component{
  constructor(props) {
    super(props);
  }
  render(){
    return(
      <VictoryChart height={400} width={400}
                    maxDomain={{y:1}} minDomain={{x:0,y:0}}
                    domainPadding={{ y: 10 }} padding={{ top: 10, bottom: 45, left: 45, right: 45 }}
      >
        <VictoryLine
          data={this.props.data}
          style={{
            data: {
              stroke: "tomato",
              strokeWidth: ({ active }) => active ? 4 : 2
            },
            labels: { fill: "tomato" }
          }}
        />
      </VictoryChart>
    );
  }
}


class Dashboard extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    console.log(this.props.data.average_score);
    return (
      <Grid
        columns={['auto', 'auto']}
        rows={['auto']}
        areas={[
          { name: 'chart1', start: [0, 0], end: [0, 0] },
          { name: 'chart2', start: [1, 0], end: [1, 0] },
        ]}
      >
        <Box gridArea="chart1" background="light-2">
          <Text textAlign="center" margin="small">Average Visiting Score by Rounds</Text>
          <RealTimeChart data={this.props.data.average_score}/>
        </Box>
        <Box gridArea="chart2" background="light-2">
          <Text textAlign="center" margin="small">Information Exchange times by Rounds</Text>
          <RealTimeChart data={this.props.data.exchange_num}/>
        </Box>
      </Grid>
    );
  }
}
export default Dashboard;
