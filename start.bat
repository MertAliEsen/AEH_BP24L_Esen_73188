@echo off
echo Program starting...
javac myEighthApp.java Account.java
if %errorlevel% neq 0 (
    echo There is a issue app cann't started!
    pause
    exit /b %errorlevel%
)
echo Program is ruunnig...
echo.
java myEighthApp
echo.
echo Done!.
pause