import React from "react";
function BookDetails() {
  const books = [
    { name: "Code With HTML", price: 395 },
    { name: "Master Node", price: 700 },
    { name: "Fly Upto Python", price: 499 },
    { name: " Deep Dive into Angular and Node", price: 799 },
  ];
  return (
    <div>
      <h1> Book Details </h1>
      {books.map((book, w) => (
        <div key={w}>
          <h3>
            <strong>{book.name}</strong>
          </h3>
          <h4>
            <p>{book.price}</p>
          </h4>
        </div>
      ))}
    </div>
  );
}
export default BookDetails;
