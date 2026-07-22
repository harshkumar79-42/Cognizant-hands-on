import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <h1>Student Score Calculator</h1>
      <CalculateScore
        name="Harsh Kumar"
        school="Delhi Public School"
        total={450}
        goal={500}
      />
      <CalculateScore
        name="Rahul Singh"
        school="St. Mary's School"
        total={380}
        goal={500}
      />
    </div>
  );
}

export default App;