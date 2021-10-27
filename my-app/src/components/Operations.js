import React from 'react';
import { Button,Grid } from '@geist-ui/react'


const Basic = () => (
    <Grid.Container gap="0" justify="center" height="50px">
        <Grid xs={2} justify="center"></Grid>
        <Grid xs={10} justify="center"><Button type="warning" ghost width="50%">重置参数</Button></Grid>
        <Grid xs={10} justify="center"><Button type="success" ghost width="50%">跑模型</Button></Grid>
        <Grid xs={2} justify="center"></Grid>
    </Grid.Container>
);

export default Basic;