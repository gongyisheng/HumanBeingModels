import React from "react";
import {Box,Grid} from "grommet";

class Nav extends React.Component {
  constructor(props) {
    super(props);
  }
  state = {
    tab_is_clicked:[0,0,0],
    tab_name:["dashboard","document","about-me"],
  }
  handleClick = (id)=>{
    let new_tab_is_clicked = [0,0,0]
    new_tab_is_clicked[id] = 1;
    this.setState(()=>({
      tab_is_clicked:new_tab_is_clicked,
    }));
    console.log(this.state.tab_name[id]);
  }
  render(){
    return (
      <Grid
        rows={['xsmall','xxsmall', 'xxsmall','xxsmall']}
        columns={['small']}
        gap="xxsmall"
        areas={[
          { name: 'logo', start: [0, 0], end: [0, 0]},
          { name: 'dashboard', start: [0, 1], end: [0, 1] },
          { name: 'document', start: [0, 2], end: [0, 2] },
          { name: 'about-me', start: [0, 3], end: [0, 3] },
        ]}
      >
        <Box
          gridArea="logo"
          background={this.props.backgroundColor}
          justify="center"
          ><h3>Human Being Models</h3></Box>

        <Box
          gridArea="dashboard"
          background={this.state.tab_is_clicked[0]===0? this.props.backgroundColor:this.props.clickedColor}
          justify="center"
          pad={{left:"10%"}}
          hoverIndicator={{ color : this.props.hoverColor }}
          onClick={()=>{this.handleClick(0)}}>Dashboard</Box>
        <Box
          gridArea="document"
          background={this.state.tab_is_clicked[1]===0? this.props.backgroundColor:this.props.clickedColor}
          justify="center"
          pad={{left:"10%"}}
          hoverIndicator={{ color : this.props.hoverColor }}
          onClick={()=>{this.handleClick(1)}}>Document</Box>
        <Box
          gridArea="about-me"
          background={this.state.tab_is_clicked[2]===0? this.props.backgroundColor:this.props.clickedColor}
          justify="center"
          pad={{left:"10%"}}
          hoverIndicator={{ color : this.props.hoverColor }}
          onClick={()=>{this.handleClick(2)}}>About Me</Box>
      </Grid>
    )
  }
}

export default Nav;
