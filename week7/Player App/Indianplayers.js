import React from "react";
const Indianplayers = () => {
  const IndianPlayers = ["Virat", "Dhoni", "Jadeja", "Pant", "Shami"];
  const [odd1, even1, odd2, even2, odd3] = IndianPlayers;

  const OddTeam = [
    { label: "First", name: odd1 },
    { label: "Third", name: odd2 },
    { label: "Fifth", name: odd3 },
  ];

  const EvenTeam = [
    { label: "Second", name: even1 },
    { label: "Fourth", name: even2 },
  ];

  const T20players = ["Suryakumar", "Ishan", "Arshdeep"];
  const RanjiPlayers = ["Pujara", "Rahane", "Saha"];
  const AllPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div style={{ padding: "20px" }}>
      <h2>Odd Players</h2>
      <ul>
        {OddTeam.map((player, i) => (
          <li key={i}>
            {player.label} : {player.name}
          </li>
        ))}
      </ul>

      <hr />

      <h2>Even Players</h2>
      <ul>
        {EvenTeam.map((player, i) => (
          <li key={i}>
            {player.label} : {player.name}
          </li>
        ))}
      </ul>

      <hr />

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {AllPlayers.map((player, i) => (
          <li key={i}>Mr. {player}</li>
        ))}
      </ul>
    </div>
  );
};

export default Indianplayers;
