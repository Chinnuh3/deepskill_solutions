import React from "react";

class Post extends React.Component {
  render() {
    const { title, body } = this.props;

    return (
      <div
        style={{ border: "3px solid pink", margin: "10px", padding: "10px" }}
      >
        <h3>{title}</h3>
        <p>{body}</p>
      </div>
    );
  }
}

export default Post;
