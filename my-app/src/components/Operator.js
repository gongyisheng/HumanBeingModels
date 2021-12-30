import React from 'react';
import { Button,Grid } from '@geist-ui/react'
import axios from "axios";

class Operator extends React.Component{
    reset() {
        console.log("Reset");
        document.getElementById("explorerNum").value = 10;
        document.getElementById("gridLength").value = 100;
        document.getElementById("rounds").value = 10000;
        document.getElementById("recommendType").value = 2;
    }
    submit() {
        console.log("Run");
        const params = {};
        params.explorerNum = document.getElementById("explorerNum").value;
        params.gridLength = document.getElementById("gridLength").value;
        params.rounds = document.getElementById("rounds").value;
        params.recommendType = document.getElementById("recommendType").value;

    }
    render() {
        return (
            <Grid.Container gap="0" justify="center" height="50px">
                <Grid xs={2} justify="center"></Grid>
                <Grid xs={10} justify="center"><Button type="warning" onClick={this.reset} ghost width="50%">Reset</Button></Grid>
                <Grid xs={10} justify="center"><Button type="success" onClick={this.submit} ghost width="50%">Run</Button></Grid>
                <Grid xs={2} justify="center"></Grid>
            </Grid.Container>
        );
    }
}

export default Operator;
