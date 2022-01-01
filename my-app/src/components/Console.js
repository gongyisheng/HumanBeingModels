import React from "react";
import {Box,Button,Text,RangeInput,Collapsible,Grid} from "grommet";

class Console extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      token : this.props.token,
      grid_length: 10,
      population: 50,
      rounds: 100,
      recom_type: 2,
      recom_type_name: ["No Recommendation","Single Side Recommendation","Double Side Recommendation"],
      recom_type_toggle: false,
    }
  }

  handleReset = () => {
    console.log("reset");
    this.setState(()=>({
      grid_length : 10,
      population : 50,
      rounds: 100,
      recom_type: 2,
    }));
  }

  render() {
    const {grid_length,population,rounds,recom_type,recom_type_name,recom_type_toggle} = this.state;
    return (
      <Grid
        rows={['xxsmall','xxsmall', 'xxsmall','xxsmall','auto']}
        columns={['auto','xsmall','xsmall','xsmall']}
        gap="xsmall"
        areas={[
          { name: 'run', start: [0, 0], end: [1, 0]},
          { name: 'reset', start: [2, 0], end: [3, 0] },
          { name: 'p1-name', start: [0, 1], end: [0, 1] },
          { name: 'p2-name', start: [0, 2], end: [0, 2] },
          { name: 'p3-name', start: [0, 3], end: [0, 3] },
          { name: 'p4-name', start: [0, 4], end: [0, 4] },

          { name: 'p1-input', start: [1, 1], end: [2, 1] },
          { name: 'p2-input', start: [1, 2], end: [2, 2] },
          { name: 'p3-input', start: [1, 3], end: [2, 3] },
          { name: 'p4-input', start: [1, 4], end: [3, 4] },

          { name: 'p1-value', start: [3, 1], end: [3, 1] },
          { name: 'p2-value', start: [3, 2], end: [3, 2] },
          { name: 'p3-value', start: [3, 3], end: [3, 3] },
        ]}
      >
        <Box
          gridArea="run"
          justify="center"
        >
          <Button margin="small" primary type="submit" label="Run"
                  onClick={()=>{
                    this.props.handleResetData(rounds);
                    this.props.handleRun(this.state);
                  }}
          />
        </Box>
        <Box
          gridArea="reset"
          justify="center"
        >
          <Button margin="small" primary type="reset" label="Reset" onClick={()=>{this.handleReset()}}/>
        </Box>
        <Box
          gridArea="p1-name"
          justify="center"
        >
          <Text margin="xsmall"><small>Grid Length</small></Text>
        </Box>
        <Box
          gridArea="p2-name"
          justify="center"
        >
          <Text margin="xsmall"><small>Population</small></Text>
        </Box>
        <Box
          gridArea="p3-name"
          justify="center"
        >
          <Text margin="xsmall"><small>Rounds</small></Text>
        </Box>
        <Box
          gridArea="p4-name"
          justify="start"
        >
          <Text margin="xsmall"><small>Recom_type</small></Text>
        </Box>
        <Box
          gridArea="p1-input"
          justify="center"
        >
          <RangeInput
            max="100"
            min="1"
            step={1}
            value={grid_length}
            onChange={ event => {
              event.preventDefault();
              this.setState({
              grid_length: event.target.value,
              population: Math.min(event.target.value*event.target.value,population),
              rounds:event.target.value*event.target.value
            })}
            }
          ></RangeInput>
        </Box>
        <Box
          gridArea="p2-input"
          justify="center"
        >
          <RangeInput
            max={grid_length*grid_length}
            min="1"
            step={1}
            value={population}
            onChange={ event => {
              event.preventDefault();
              this.setState({population:event.target.value})}
            }
          ></RangeInput>
        </Box>
        <Box
          gridArea="p3-input"
          justify="center"
        >
          <RangeInput
            max={grid_length*grid_length}
            min="1"
            step={1}
            value={rounds}
            onChange={event => {
              event.preventDefault();
              this.setState({rounds:event.target.value})}
            }
          ></RangeInput>
        </Box>
        <Box
          gridArea="p4-input"
          align="center"
          justify="center"
        >
          <Box
            align="center"
            justify="center"
            hoverIndicator={{ color : this.props.hoverColor }}
            onClick={() => this.setState({recom_type_toggle: !recom_type_toggle})}
          >
            <Text><small>{recom_type_name[recom_type]}</small></Text>
          </Box>
          <Collapsible open={recom_type_toggle}>
            <Box
              align="center"
              justify="center"
              hoverIndicator={{ color : this.props.hoverColor }}
              onClick={()=>{
                this.setState({
                  recom_type: 2,
                  recom_type_toggle: false,
                });
              }}
            >
              <Text><small>Double Side Recommendation</small></Text>
            </Box>
            <Box
              align="center"
              justify="center"
              hoverIndicator={{ color : this.props.hoverColor }}
              onClick={()=>{
                this.setState({
                  recom_type: 1,
                  recom_type_toggle: false,
                });
              }}
            >
              <Text><small>Single Side Recommendation</small></Text>
            </Box>
            <Box
              align="center"
              justify="center"
              hoverIndicator={{ color : this.props.hoverColor }}
              onClick={()=>{
                this.setState({
                  recom_type: 0,
                  recom_type_toggle: false,
                });
              }}
            >
              <Text><small>No Recommendation</small></Text>
            </Box>
          </Collapsible>
        </Box>
        <Box
          gridArea="p1-value"
          justify="center"
        >
          <Text margin="xsmall"><h5>{this.state.grid_length}</h5></Text>
        </Box>
        <Box
          gridArea="p2-value"
          justify="center"
        >
          <Text margin="xsmall"><h5>{this.state.population}</h5></Text>
        </Box>
        <Box
          gridArea="p3-value"
          justify="center"
        >
          <Text margin="xsmall"><h5>{this.state.rounds}</h5></Text>
        </Box>
      </Grid>
    )
  }
}
export default Console;
