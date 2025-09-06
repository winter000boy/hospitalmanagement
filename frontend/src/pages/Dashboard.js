import React from 'react';
import { Container, Grid, Paper, Typography, Box } from '@mui/material';
import PeopleAltIcon from '@mui/icons-material/PeopleAlt';
import LocalHospitalIcon from '@mui/icons-material/LocalHospital';

const StatCard = ({ title, value, icon }) => (
  <Paper elevation={3} sx={{ p: 3, height: '100%' }}>
    <Box display="flex" alignItems="center" mb={2}>
      {icon}
      <Typography variant="h6" component="div" ml={1}>
        {title}
      </Typography>
    </Box>
    <Typography variant="h4" component="div">
      {value}
    </Typography>
  </Paper>
);

const Dashboard = () => {
  return (
    <Container maxWidth="lg" sx={{ mt: 4, mb: 4 }}>
      <Typography variant="h4" gutterBottom>
        Dashboard
      </Typography>
      <Grid container spacing={3}>
        <Grid item xs={12} md={6}>
          <StatCard
            title="Total Patients"
            value="Loading..."
            icon={<PeopleAltIcon fontSize="large" color="primary" />}
          />
        </Grid>
        <Grid item xs={12} md={6}>
          <StatCard
            title="Total Doctors"
            value="Loading..."
            icon={<LocalHospitalIcon fontSize="large" color="primary" />}
          />
        </Grid>
      </Grid>
    </Container>
  );
};

export default Dashboard;
