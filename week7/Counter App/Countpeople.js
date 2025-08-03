import React from "react";
class Countpeople extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      entrycount: 0,
      exitcount: 0,
    };
  }
  UpdateEntryCount = () => {
    this.setState((prevState) => ({
      entrycount: prevState.entrycount + 1,
    }));
  };

  UpdateExitCount = () => {
    this.setState((prevState) => ({
      exitcount: prevState.exitcount + 1,
    }));
  };

  render() {
    return (
      <div
        style={{
          border: "2px solid green",
          padding: "50px",
          width: "200px",
          margin: "100px auto",
        }}
      >
        <h2>Counter App</h2>
        <p>People Entered: {this.state.entrycount}</p>
        <p>People Exited: {this.state.exitcount}</p>
        <button
          onClick={this.UpdateEntryCount}
          style={{
            marginRight: "10px",
            color: "green",
            border: "5px solid green",
            padding: "10px 15px",
            fontWeight: "bold",
            backgroundColor: "white",
            borderRadius: "5px",
          }}
        >
          Login
        </button>
        <button
          onClick={this.UpdateExitCount}
          style={{
            marginRight: "30px",
            color: "red",
            border: "5px solid red",
            padding: "10px 15px",
            fontWeight: "bold",
            backgroundColor: "white",
            borderRadius: "5px",
          }}
        >
          Exit
        </button>
      </div>
    );
  }
}
export default Countpeople;
