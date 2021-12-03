import React from 'react';
import {Grid, Input, Spacer, Radio} from '@geist-ui/react'
import Operation from "./Operator";

class Form extends React.Component{
    render(){
        return (<Grid.Container justify="center">
            <Grid xs={2}></Grid>
            <Grid xs={20} justify="center">
                <Grid.Container justify="left">
                    <Operation/>
                    <Grid xs={24} justify="left">
                        <h1>Basic Parameters</h1>
                    </Grid>
                    <Grid xs={24} justify="left">
                        <Input id="explorerNum" label="Number of Explorers" placeholder="10" clearable/>
                        <Spacer w={3}/>
                        <Input id="gridLength" label="Length of Grid" placeholder="100" clearable/>
                        <Spacer w={3}/>
                        <Input id="rounds" label="Rounds to explore" placeholder="10000" clearable/>
                    </Grid>
                    <Spacer h={3}/>
                    <Grid xs={24} justify="left">
                        <h1>Optional Parameters</h1>
                    </Grid>
                    <Grid xs={24}>
                        <Grid.Container justify="left">
                            <Grid xs={5} justify="left">
                                <a>Recommendation Type</a>
                            </Grid>
                            <Grid xs={22} justify="left">
                                <Radio.Group id="recommendType" value="2" useRow>
                                    <Radio value="2">
                                        Bi-directional
                                    </Radio>
                                    <Radio value="1">
                                        Single-directional
                                    </Radio>
                                    <Radio value="0">
                                        No Recommendation
                                    </Radio>
                                </Radio.Group>
                            </Grid>
                        </Grid.Container>
                    </Grid>
                </Grid.Container>
            </Grid>
            <Grid xs={2} justify="center"></Grid>
        </Grid.Container>)
    }
}


export default Form;