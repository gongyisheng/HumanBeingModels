import React from "react";
import RealTimeChart from "../components/RealTimeChart";
import {Box,Text,Grid} from "grommet";

class Dashboard extends React.Component {
  render() {
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
          <Text textAlign="center" margin="small">Average Visiting Preference Score by Rounds</Text>
          <RealTimeChart data={this.props.data.average_score} ymax="1"/>
        </Box>
        <Box gridArea="chart2" background="light-2">
          <Text textAlign="center" margin="small">Number of Recommendation Behavior by Rounds</Text>
          <RealTimeChart data={this.props.data.exchange_num}/>
        </Box>
      </Grid>
    );
  }
}
export default Dashboard;
