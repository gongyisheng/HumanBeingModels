import React from 'react';
import { Grid,Input,Spacer,Radio } from '@geist-ui/react'

const Basic = () => (
    <Grid.Container justify="center">
        <Grid xs={2}></Grid>
        <Grid xs={20} justify="center">
            <Grid.Container justify="left">
                <Grid xs={24} justify="left">
                    <h1>重要参数</h1>
                </Grid>
                <Grid xs={24} justify="left">
                    <Input label="设置网络人数" placeholder="10"/>
                    <Spacer w={3}/>
                    <Input label="设置网络边长" placeholder="100" />
                    <Spacer w={3}/>
                    <Input label="设置循环轮数" placeholder="10000" />
                </Grid>
                <Spacer h={3}/>
                <Grid xs={24} justify="left">
                    <h1>其他参数</h1>
                </Grid>
                <Grid xs={24}>
                    <Grid.Container justify="left">
                        <Grid xs={1} justify="left">
                            <a>推荐类型</a>
                        </Grid>
                        <Grid xs={22} justify="left">
                            <Radio.Group value="2" useRow>
                                <Radio value="2">
                                    双向推荐
                                </Radio>
                                <Radio value="1">
                                    单向推荐
                                </Radio>
                                <Radio value="0">
                                    不推荐
                                </Radio>
                            </Radio.Group>
                        </Grid>
                    </Grid.Container>
                </Grid>
            </Grid.Container>
        </Grid>
        <Grid xs={2} justify="center"></Grid>
    </Grid.Container>
);

export default Basic;