import React from "react";
import {VictoryChart, VictoryLine} from "victory";

class RealTimeChart extends React.Component{
  constructor(props) {
    super(props);
  }
  render(){
    return(
      <VictoryChart height={400} width={400}
                    maxDomain={{y:this.props.ymax}} minDomain={{x:0,y:0}}
                    domainPadding={{ y: 10 }} padding={{ top: 10, bottom: 45, left: 45, right: 45 }}
      >
        <VictoryLine
          data={this.props.data}
          style={{
            data: {
              stroke: "tomato",
              strokeWidth: ({ active }) => active ? 4 : 2
            },
            labels: { fill: "tomato" }
          }}
        />
      </VictoryChart>
    );
  }
}

export default RealTimeChart;
