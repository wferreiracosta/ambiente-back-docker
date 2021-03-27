const express = require('express');
const app = express();

const PORT = 3000;
const HOST = '0.0.0.0';

app.get('/', (req, res) => {
  res.send('Hello World teste');
});

app.listen(PORT, HOST);