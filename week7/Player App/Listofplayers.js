import React from "react";
const Listofplayers = () => {
  const players = [
    { name: "Virat", score: 95 },
    { name: "Dhoni", score: 85 },
    { name: "Markram", score: 78 },
    { name: "Pant", score: 65 },
    { name: "Stokes", score: 72 },
    { name: "David", score: 88 },
    { name: "Smith", score: 40 },
    { name: "Jadeja", score: 69 },
    { name: "Gayle", score: 69 },
    { name: "Warner", score: 50 },
    { name: "Shami", score: 71 },
  ];

  const lowscorers = players.filter((player) => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} : {player.score}
          </li>
        ))}
      </ul>

      <h3>Players with score &lt; 70:</h3>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>
            {player.name} : {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Listofplayers;
