import React from "react";
function App() {
  const image =
    "https://t4.ftcdn.net/jpg/02/10/62/03/360_F_210620329_0le9P2aUC9LUqCyf6yqiV8MtVWrzGKi7.jpg";

  const officeList = [
    { name: "Sky Tower", rent: 75000, address: "Noida" },
    { name: "Tech Space", rent: 55000, address: "Hyderabad" },
    { name: "Business Bay", rent: 62000, address: "Bangalore" },
    { name: "Downtown Offices", rent: 48000, address: "Chennai" },
    { name: "Data Tech Park", rent: 790560, address: "Siruseri, Chennai" },
  ];

  return (
    <div style={{ textAlign: "center", padding: "40px" }}>
      <h1> Office Space Rental App </h1>
      <img
        src={image}
        alt="Office"
        style={{ width: "400px", height: "250px", objectFit: "cover" }}
      />
      {officeList.map((office, index) => (
        <div
          key={index}
          style={{
            border: "1px solid gray",
            margin: "10px auto",
            padding: "10px",
            width: "700px",
            textAlign: "left",
          }}
        >
          <h2>{office.name}</h2>
          <p
            style={{
              color: office.rent < 60000 ? "red" : "green",
              fontWeight: "bold",
            }}
          >
            Rent: ₹{office.rent}
          </p>
          <p>Address: {office.address}</p>
        </div>
      ))}
    </div>
  );
}
export default App;
