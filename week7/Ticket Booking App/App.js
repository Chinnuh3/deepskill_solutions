import React, { useState } from "react";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      {isLoggedIn ? (
        <>
          <h1>Welcome back!</h1>
          <button
            onClick={handleLogout}
            style={{ width: "80px", height: "30px" }}
          >
            Logout
          </button>
        </>
      ) : (
        <>
          <h1>Please sign up.</h1>
          <button
            onClick={handleLogin}
            style={{ width: "80px", height: "30px" }}
          >
            Login
          </button>
        </>
      )}
    </div>
  );
}

export default App;
