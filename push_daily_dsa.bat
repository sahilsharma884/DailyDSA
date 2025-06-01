@echo off
setlocal enabledelayedexpansion

:: Display incoming argument
echo ✅ Received commit message argument: [%1]

:: Check if commit message is provided
if "%~1"=="" (
    echo ❌ Error: Please provide a commit message.
    goto end
)

:: Get current date in YYYY-MM-DD format
for /f %%i in ('powershell -NoProfile -Command "Get-Date -Format yyyy-MM-dd"') do set DATE=%%i
set MSG=%*

:: Show processing info
echo ----------------------------------
echo 📅 Date: %DATE%
echo 📝 Message: %MSG%
echo ----------------------------------

:: Append to README.md
echo - [%DATE%] %MSG% >> README.md
echo ✅ Added to README.md

:: Git commands
echo 🔄 Running git add, commit, and push...
git add .
git commit -m "%MSG%"
git push

echo ✅ Git push completed.

:end
pause