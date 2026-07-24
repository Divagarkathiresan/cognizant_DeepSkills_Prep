import React from 'react';

const T20players = ['Rohit Sharma', 'Virat Kohli', 'Hardik Pandya'];
const RanjiTrophyPlayers = ['Shubman Gill', 'Ajinkya Rahane', 'Cheteshwar Pujara'];

export default function IndianPlayers() {
  const allPlayers = [...T20players, ...RanjiTrophyPlayers];
  const [oddPlayer, evenPlayer] = T20players;

  return (
    <div>
      <h2>Indian Players</h2>
      <p>Odd Team Player: {oddPlayer}</p>
      <p>Even Team Player: {evenPlayer}</p>

      <h3>Merged Players</h3>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}
