import React from 'react';

const players = [
  { id: 1, name: 'Rohit Sharma', score: 85 },
  { id: 2, name: 'Virat Kohli', score: 92 },
  { id: 3, name: 'Shikhar Dhawan', score: 67 },
  { id: 4, name: 'KL Rahul', score: 74 },
  { id: 5, name: 'Hardik Pandya', score: 64 },
  { id: 6, name: 'Jasprit Bumrah', score: 58 },
  { id: 7, name: 'Ravindra Jadeja', score: 81 },
  { id: 8, name: 'MS Dhoni', score: 70 },
  { id: 9, name: 'Suryakumar Yadav', score: 76 },
  { id: 10, name: 'Yuzvendra Chahal', score: 69 },
  { id: 11, name: 'Rishabh Pant', score: 88 }
];

export default function ListofPlayers() {
  const below70Players = players.filter((player) => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map((player) => (
          <li key={player.id}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h3>Players with score below 70</h3>
      <ul>
        {below70Players.map((player) => (
          <li key={player.id}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}
