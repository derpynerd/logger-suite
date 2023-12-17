# LoggerSuite

About - A program to store and manage a list of all kinds of notes  

The main idea behind this program is to store all of your notes in a
centralized txt file.  
Since doing that manually would be quite tedious, my goal is to
automate the creating, storing, deleting & searching of said notes 
within a single file without having to go through the intricacies of
how the notes are stored.

The hierarchy of the notes is as follows -  
Lore > Sublore > Topic  

## Project Structure -  
- ConfigLoader loads the central txt file
- Runner runs the file after loading all the configurations
- IO handles all the formatting and querying functions
- Model stores all the Topics in the above-mentioned hierarchy

### Disclaimer - This project is a work in progress (WIP)