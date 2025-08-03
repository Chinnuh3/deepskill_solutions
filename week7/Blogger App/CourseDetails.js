import React from "react";
function CourseDetails() {
  const courses = [
    { name: "HTML", date: "1/5/2023" },
    { name: "NodeJS", date: "4/6/2022" },
    { name: "Python", date: "7/9/2021" },
  ];
  return (
    <div>
      <h1> Course Details </h1>
      {courses.map((course, q) => (
        <div key={q}>
          <h3>
            <strong>{course.name}</strong>
          </h3>
          <h4>
            {" "}
            <p>{course.date}</p>
          </h4>
        </div>
      ))}
    </div>
  );
}
export default CourseDetails;
