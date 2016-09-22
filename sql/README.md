# Installation and re-installation script only

## Microsoft Windows

Version: 9.5.3
Binary directory: c:\Program Files\PostgreSQL\9.5
Data directory: C:\Program Files\PostgreSQL\9.5\data
Port: 5432
Superuser: postgres (or use your own login name to database)
Password: delllenovo (or use your own password)

Förbered att postgresql fungerar i kommandoprompten genom att lägga till 

C:\Program Files\PostgreSQL\9.5\bin;C:\Program Files\PostgreSQL\9.5\lib (eller hur din sökväg nu ser ut)

i avancerade systeminställningar - Environment variables och gå till path.

Det är precis samma förfarande som vi gjort för att få java att fungera i kommandoprompten. 


 -------------------------------------------------------------------------------------------

För att mata in det i databasen ska vi använda psql i kommandoprompten (bara första gången)

1. psql -U postgres -h localhost -f postgresql_pagiste_database.sql

Nu är databasen pagiste skapad. Vi behöver i normala fall inte köra 1. igen.

2. psql -U admin -d pagiste -h localhost -f postgresql_pagiste_database_structure.sql

Här får du upp Password for user admin: skriv lösenordet <Cow$girl@!>

3. psql -U admin -d pagiste -h localhost -f postgresql_pagiste_sample_data.sql

*Done

