import React from "react";
import BookDetails from "./BookDetails";
import CourseDetails from "./CourseDetails";
import BlogDetails from "./BlogDetails";
import "./App.css";
function App() {
  return (
    <div className="app-container">
      <div className="section">
        <CourseDetails />
      </div>
      <div className="section">
        <BookDetails />
      </div>
      <div className="section">
        <BlogDetails />
      </div>
    </div>
  );
}
export default App;
