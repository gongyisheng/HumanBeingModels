import React from "react";
import { Link } from 'react-router-dom';
import { Box,Grid } from "grommet";

//global variables
import '../main';
const menus = global.menus;

class Nav extends React.Component {
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

  renderMenu = ({title, name, key, id}) => {
    return (
      <Link to={key} key={name.toString()} style={{ textDecoration: 'none' }}>
        <Box
          gridArea={name}
          background={this.state.tab_is_clicked[id]===0? this.props.backgroundColor:this.props.clickedColor}
          justify="center"
          pad={{left:"10%"}}
          fill="vertical"
          hoverIndicator={{ color : this.props.hoverColor }}
          onClick={()=>{this.handleClick(id)}}
        >
          {title}
        </Box>
      </Link>
    );
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
          align="center"
          justify="center"
          ><h4>Social Network Model</h4></Box>
        {
          menus.map(item => {
            return this.renderMenu(item);
          })
        }
      </Grid>
    )
  }
}

export default Nav;
