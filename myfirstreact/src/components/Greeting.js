import React, { useState } from 'react';
import User from './User';
import Guest from './Guest';

export default function Greeting() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return isLoggedIn ? (
    <User onLogout={() => setIsLoggedIn(false)} />
  ) : (
    <Guest onLogin={() => setIsLoggedIn(true)} />
  );
}