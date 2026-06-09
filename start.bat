@echo off
javac myThirteenthApp.java

if errorlevel 1 (
    echo Compilation failed.
    pause
    exit /b
)

java myThirteenthApp
pause