#!/bin/sh

cd /app

echo "Running npm install..."
time npm install

echo "Running build..."
time npm run build

echo "IF there is no error, then proceed with docker-compose build"
