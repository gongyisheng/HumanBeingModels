import React from "react";
import '../App.css';
import {Image,Box} from "grommet";
class AboutMe extends React.Component {
  render() {
    return (
      <div className="about-me">
        <Box align="center" justify="center" height="medium" width="any CSS size">
          <Image fit="contain" alignSelf="stretch" src="/static/img/about-me-profile.jpg"/>
        </Box>
        <p>Greetings! My name is Yisheng Gong from Shanghai, China.
          I graduated from Fudan University with a bachelor's degree.
          I am currently studying at WashU and will graduate in May.
          I hope to start my career as a software engineer.</p>
        <p>I am a hungry learner and an idea creator.
          I really enjoy utilizing software to make my ideas/imagination
          come true and help me understand things that I am not familiar with.
          My favorite thing is to make new friends and chat with them.
          I hope that I can share my ideas with everyone, approach the truth
          step by step in an open environment and witness its growth.
          If you are interested in me or my ideas, feel free to contact me
          on <a
            href="https://www.linkedin.com/in/yisheng-gong1997/"
            target="_blank"
            rel="noreferrer"
          >linkedin</a>
          , <a
            href="https://github.com/gongyisheng"
            target="_blank"
            rel="noreferrer"
          >github</a> or write
          an <a
            href="mailto:yishenggong9437@gmail.com?subject=[GitHub]%20HumanBeingModels"
            target="_blank"
            rel="noreferrer"
          >e-mail</a>.</p>
        <p>Besides, I'm also a skilled novel writer and poet. My collection
          is <a
            href="https://mp.weixin.qq.com/mp/appmsgalbum?action=getalbum&__biz=MzI2Mzg1OTMxOQ==&scene=2&album_id=2184096961665073152&count=3"
            target="_blank"
            rel="noreferrer">here</a> if
          you can understand Chinese very well. It's all about imagination and some wonderful emotions I want to record in my life.
          Hope you will also love my stories :) </p>
        <p>Thank you!</p>
        <p>Yisheng Gong</p>
        <p>Jan 11,2021</p>
        <p></p>
      </div>
    )
  }
}
export default AboutMe;
