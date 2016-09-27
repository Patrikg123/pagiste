# pagiste
Import the project as a maven project. 
Set up the database.
Step 1:Use the cd command to make the Postgres Plus bin directory your current
working directory.
cd C:\Program Files\PostgresPlus\8.4SS\bin
Note: If you are using Postgres Plus Advanced Server, use the cd command to make
dbserver\bin your current working directory.
Step 2: Run the psql program with the name of a database to which a connection is to
be established (-d option), a role name that has the superuser privilege (-U option), and
the directory path to the backup file (-f option).
Note: The database you specify with the -d option is not affected by the restore
operation. The psql program requires a session to be established over a database
connection before it can process the SQL statements and psql commands from the
backup file.
psql -d postgres -U postgres -f C:\Backup\pagistebackup.psql

If you run into problem check http://get.enterprisedb.com/docs/Tutorial_Windows_PP_Backup_Restore.pdf
You might need to create a database 
