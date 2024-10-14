import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import  {Navbar, Card}  from "./components/index";

import "./App.css";

function App() {
  const [count, setCount] = useState(0);

  return (
    <div className="flex justify-center items-center">
      
      <Navbar />
      <Card />
    </div>
  );
}

export default App;

