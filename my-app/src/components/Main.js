import React from "react";
import {Box,Grid} from "grommet";
import Dashboard from "./Dashboard";
import Console from "./Console";

class Main extends React.Component {
  constructor(props) {
    super(props);
  }

  render(){
    return (
      <Grid
        columns={['flex','auto']}
        rows={['flex']}
        areas={[
          { name: 'dashboard', start: [0, 0], end: [0, 0]},
          { name: 'console', start: [1, 0], end: [1, 0] },
        ]}
      >
        <Box gridArea="dashboard" background={this.props.bodyColor}>
          <Dashboard/>
        </Box>
        <Box gridArea="console" background={this.props.consoleColor}>
          <Console hoverColor={this.props.hoverColor}/>
        </Box>
      </Grid>
    )
  }
}

export default Main;
