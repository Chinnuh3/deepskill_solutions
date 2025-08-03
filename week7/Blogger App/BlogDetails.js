import React from "react";

function BlogDetails() {
  const blogs = [
    {
      title: "React Learning",
      author: "Stephen Biz",
      content: "Welcome to learning React!",
    },
    {
      title: "Installation",
      author: "Schewzdenier",
      content: "You can install React from npm.",
    },
    {
      title: "Component Reusability",
      author: "Liam Carter",
      content:
        "Learn how to create reusable components in React for cleaner code.",
    },
  ];

  return (
    <div>
      <h1>Blog Details</h1>
      {blogs.map((blog, idx) => (
        <div
          key={idx}
          style={{
            marginBottom: "25px",
            paddingBottom: "10px",
          }}
        >
          <h3>
            <strong>{blog.title}</strong>
          </h3>
          <h4>
            <b>{blog.author}</b>
          </h4>
          <h5>
            <p>{blog.content}</p>{" "}
          </h5>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
