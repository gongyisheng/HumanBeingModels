import React from "react";
import { Box } from 'grommet';
import '../App.css';

class Document extends React.Component {
  render() {
    return (
      <Box className="document">
        <h2>Background</h2>
        <p>The origin of the idea of this project comes from <a
          href="https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life"
          target="_blank"
          rel="noreferrer"
        >Conway's Game of Life</a>.
          The Game of Life builds complex phenomena through the interaction of objects
          based on simple rules, which reminds me that this is quite similar to how people
          make connections and interact in the social network. My idea goes further than
          the game of life. In the game of life, the rules are already formulated.
          If we can provide some adjustable parameters and rules for us to choose and explore,
          the number of parameter combinations will increase exponentially, which enables us
          to create different kinds of social networks of parallel universes from simple to complex. </p>
        <p>
          By observing the characteristics of different social networks, We have got some very
          interesting findings. Eg. in the models with the same proportion of people in the grid,
          a larger network works better to exchange information than a small one, with average visiting
          score reaching a peak quickly. We do not have a perfect explanation for such a phenomenon but I'm
          sure there's large space for exploring.
        </p>
        <p>
          This project aims to help people better understand the social network from a global perspective
          and the process of information dissemination in the network,
          thanks to computers that make this possible.
        </p>
        <h2>Model</h2>
        <p>The model consists of two parts: a <b>square map</b> and several <b>explorers</b></p>
        <p className="document-paragraph">
          <h3>Map</h3>
          <p>The map is the space for explorers to explore and exchange information.</p>
          <p className="document-paragraph">
            <h4>Parameters</h4>
            <ul className="document-unordered-list">
              <li className="document-list-item">
                <p className="document-list-item-title">
                  <b>grid_length</b> : side length of the map</p>
                <p className="document-list-item-description">It's recommend to set it below 70 so that
                  it won't take you much time:)</p>
              </li>
              <li className="document-list-item">
                <p className="document-list-item-title">
                  <b>population</b> : number of explorers in the map</p>
                <p className="document-list-item-description">Small population may make a network fail and
                  big population may make information transmit in the network very fast. </p>
              </li>
              <li className="document-list-item">
                <p className="document-list-item-title">
                  <b>rounds</b> : number of steps you want the explorers to explore in the map.</p>
                <p className="document-list-item-description">It is set to grid_length^2 by default so that
                  every explorer will visit every position of the map in the end.</p>
              </li>
            </ul>
            <h4>Constraints</h4>
            <ul className="document-unordered-list">
              <li className="document-list-item">
                <code>1 &lt;= grid_length &lt;= 100 </code>
              </li>
              <li className="document-list-item">
                <code>1 &lt;= population &lt;= grid_length^2</code>
              </li>
              <li className="document-list-item">
                <code>1 &lt;= rounds &lt;= grid_length^2</code>
              </li>
            </ul>
          </p>
          <h3>Explorer</h3>
          <p>Explorer has a <b>start position</b>, a <b>preference map</b> and a <b>toVisit queue</b> once it's initialized.</p>
          <p>
            <b>Start position</b> determines where explorer start to explore.
            <p className="document-list-item-description">
              Start position matters! It's initialized randomly in this time. But I plan to provide more options in the future.</p>
          </p>
          <p>
            <b>Preference map</b> contains the explorer's preference score for every position in the map.
            <p className="document-list-item-description">
              It's an a decimal between 0 to 1. The higher the score is, the more the explorer want to visit the position.</p>
            <p className="document-list-item-description">
              It's initialized randomly in this time. But I plan to provide more different initializers in the future.</p>
          </p>
          <p>
            <b>ToVisit queue</b> contains the explorer's target positions he/she want to visit in the next round.
            <p className="document-list-item-description">
              Every round the explorer will only visit the position in the toVisit queue with largest preference score.</p>
            <p className="document-list-item-description">
              Two ways to add a position to the queue:
              <b> near the explorer's current position (one block away)</b> or <b>recommended by others</b></p>
            <p className="document-list-item-description">
              Only unvisited positions can be added to toVisit queue.</p>
          </p>
          <p className="document-paragraph">
            <h4>Parameters</h4>
            <ul className="document-unordered-list">
              <li className="document-list-item">
                <p className="document-list-item-title">
                  <b>recom_type</b> : the type of recommendation rule when two explorers meet with each other</p>
                <p className="document-list-item-description">
                  Only explorers in the <b>same position</b> of the map
                  in the <b>same round</b> can make recommendations to each other</p>
                <p className="document-list-item-description">
                  To make recommendations, A will add B's <b>visited positions</b> to its <b>toVisit queue</b>.</p>
                <p className="document-list-item-description">
                  <b>Double-side recommendation</b> : A will make recommendations to B and so will B.</p>
                <p className="document-list-item-description">
                  <b>Single-side recommendation</b> : Randomly pick an explorer from A and B and the one will make recommendations to the other.</p>
                <p className="document-list-item-description">
                  <b>No recommendation</b> : A will not make recommendations to B and so will not B.</p>
              </li>
              <li className="document-unordered-list">
                more parameters coming...
              </li>
            </ul>
          </p>
          <h2>Outputs</h2>
          <p className="document-paragraph">
            <p>Chart1. <b>Average Visiting Preference Score by Rounds</b></p>
            <p className="document-list-item-description">
              This chart records the change of average visiting preference score of all explorers by round.
              You may observe the score keeps declining by rounds because the explorers tend to visited positions
              with high preference score at first. You may also observe there's peak in some of the model. Well,
              it means that the network works and recommendations enable explorers to find their favourite positions.</p>
            <p>Chart2. <b>Number of Recommendation Behavior by Rounds</b></p>
            <p className="document-list-item-description">
              This chart records number of recommendation behavior by round.
              It is determined by the density of explorers and type of recommendation.</p>
          </p>
          <h2>How to play the game</h2>
          <p>Try different parameters and observe the outline of the curve, make records of its peak, etc... Finding part is coming soon lol</p>
        </p>
      </Box>
    );
  }
}
export default Document;
