# Git and Github

### Access to quality notes and important commands from [here]()

### How to participate

## How to contribute

1. Fork the project
2. Make any changes in your forked repo
3. On this repo, click `Pull Requests` and raise a `Pull Request` selecting your fork on the right drop down

Questions can be asked by raising an `Issue`.

## How to clone repo and make changes locally

```
  click on the clone button (green in colour). This gives you a copy of the project. Its now yours to play around with
```
OR
- Using git on your local machine. Do this to download the forked copy of this repo to your computer

```
  git clone https://github.com/yourGithubUsername/DSA-Marathon.git
```

- switch to the cloned folder. This can be done with Gitbash or the integrated terminal in the VSCode editor

```
  cd DSA-Marathon
```

- Make a new branch. Your name would make a good branch because it's unique

```
  git checkout -b <name of new branch>
```

- Open the file `README.md`

- #### Add your name to the section that is headed with your first initial. Then, add your name in alphabetical order of the second letter in your name. If the second letters are the same, order it in alphabetical order of the third, and so on. Next to it, add the link to your github username page.

- For example ,
  `- [Full Name](https://github.com/your-username)`
  `- [Repo Name](https://github.com/your-username/repo-name)`

- Stage your changes

```
  git add README.md
```

- Commit the changes

```
  git commit -m "Add <your-github-username>"
```

- Check the status of your repository

```
  git status
```

- Pushing your repository to github

```
  git push origin <name of your branch>
```

or

```
  git branch -M main
  git push -u origin main
```

- Navigate to your fork, on the top of the files section you'll notice a new section containing, a contribute button!
- Click on the contribute button, it will open a drop down, click the pull request button on the drop down
  Note: A pull request allows your changes to be merged with the original project.

- Wait for your changes to be merged

Hurray! You successfully made a contribution!

---