# pagiste

Setup instructions for git against the Pagiste project

First move to the directory where you want the project.

For example use
c:\dev\

then import the repository you want

git clone https://github.com/Patrikg123/pagiste.git

It start downloading....

then write cd pagiste and there you see the files (write dir)

Done*

Now you need to change to branch pagistedevelopment

git checkout -b pagistedevelopment (check if worked with git status)

Now you need to tell git about the remote pagistedevelopment

git branch --set-upstream-to=origin/pagistedevelopment

Now update with newer files from pagistedevelopment (probably there are older files in master)

git pull

Done*


if first time you set up git, you need to update with some global parameters

git config --global user.name "Your name"

git config --global user.email mail@mail.com

or if you are using several different git accounts on same machine/system instead use local parameters

git config user.name "Your name"

git config user.email mail@mail.com

Then you easy can have different git account in each project.

If you get into trouble with global settings use

git config --global --unset-all user.name
git config --global --unset-all user.email

Done*


The steps below you repeat every time you work in the project.

Now everytime you want to work with the files, you need to sync with the repository
to get all latest changes made by other people in the project.

git pull

Done*


Now you have worked and want to update the repository pagistedevelopment with the changes you have made in some files.

git add filename 

or if you have changed several files 

git add .

then commit with a message what the update is about

git commit -m "message (update info)"


then update github remote pagistedevelopment with


git push -u origin pagistedevelopment

*Done*