import React from "react";

class Footer extends React.Component{
  constructor(props) {
    super(props);
  }
  render(){
    return(
        <div align="center">
            <small>HumanBeingModels @Yisheng Gong 2021-</small>
            <br/>
            <a
                href="https://github.com/gongyisheng/HumanBeingModels"
                target="_blank"
                rel="noopener noreferrer"
            >
              <small>Github</small>
            </a>
        </div>
    );
  }
}

export default Footer;
