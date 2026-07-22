import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div>
      <h1>Cohort Dashboard</h1>
      <CohortDetails
        name="Java FSE Batch 1"
        status="ongoing"
        startDate="01-Jan-2026"
        endDate="30-Jun-2026"
        students={45}
      />
      <CohortDetails
        name="React Batch 1"
        status="completed"
        startDate="01-Jul-2025"
        endDate="31-Dec-2025"
        students={38}
      />
      <CohortDetails
        name="Python Batch 1"
        status="ongoing"
        startDate="01-Mar-2026"
        endDate="31-Aug-2026"
        students={52}
      />
    </div>
  );
}

export default App;