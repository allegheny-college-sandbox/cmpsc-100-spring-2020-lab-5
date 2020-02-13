# CMPSC 100-02 Lab Session 5: Secret agent gator

* Assigned: 13 February 2020
* Due: 20 February 2020 by 2:30 PM
* Point value: 25

This lab session continues our discussion and learning of `String`s and `methods` in an effort to introduce concepts like `casting` and the `char` primitve.

* [Slack](https://cmpsc-100-02-sp-2020.slack.com)
* [GitHub](https://www.github.com)
* git
* Markdown
* [Atom](https://atom.io)
* [Docker](https://www.docker.com/products/docker-desktop)
* GatorGrader
* gradle

## Table of Contents

* [Accepting the assignment](#accepting-the-assignment)
* [Activity: Secret agent gator](#secret-agent-gator)
* [Evaluation](#evaluation)
* [GatorGrader](#gatorgrader)

## General guidelines for laboratory sessions

* **Follow steps carefully.** Laboratory sessions often get a bit more complicated than their preceeding Practical sessions. Especially for early sessions which expose you to platforms with which you may not be familiar, take notes on `command`s you run and their corresponding effects/outputs. If you find yourself stuck on a step, let a TL or the professor know! Laboratory sessions do not mean that we won't help you in the same way we do during Practicals.
* **Regularly ask and answer questions.** Some of you may have more experience with the topics we're discussing than others. We can use this knowledge to our advantage. But, like in Practicals, let students try things for a while before offering help (**always _offer_ first**). To ask questions, use our [Slack](https://cmpsc-100-02-sp-2020.slack.com)'s `#labs` channel.
* **Store and transfer files using GitHub.** Various forms of file storage are more or less volatile. *You* are responsible for backing up and storing files. If you're unsure of files which have been changed, you can always type `git status` in the terminal for your working folder to determine what you need to back up.
* **Keep all of your files.** See above, but also remember that you're responsible for the files you create.
* **Back up your files regularly.** See above (and above-above).
* **Review the [Honor Code](https://sites.allegheny.edu/about/honor-code/) regularly when working.** If you're taking a solution from another student or the Internet at-large (_especially_ [Stack Overflow](https://stackoverflow.com)), bear in mind that using these solutions _can_ constitute a form of plagiarism that violates the Allegheny Honor Code. While it may seem easy and convenient to use these sources, it is equally easy and convenient to rely on them and create bad habits which include not attributing credit or relying exclusively on others to solve issues. Neither are productive uses of your intellect. Really.

## Further helpful reading for this assignment

I recommend reading the [GitHub Guides](https://guides.github.com) which GitHub makes available. In particular, the guides:

* [Mastering Markdown](https://guides.github.com/features/mastering-markdown/)
* [Documenting your projects on GitHub](https://guides.github.com/features/wikis/)
* [GitHub Handbook](https://guides.github.com/introduction/git-handbook/)

## Secret agent gator

Unable to indulge his passion for hats, G. Wiz took some of the money they had remaining and signed up for secret society chain letter club. Today, our gator friend recieved their first communication -- their club code name -- and a secret club decoder ring. But, G. Wiz doesn't know how to use it. 

Essentially, the club decoding process comprises two steps:

1. Calculate the number of letters in a given words
2. "Move" each letter _back_ by that amount

For example, the word `gator` would appear as `lfytw`. Moving each letter back `5` results in our original word, `gator`.

Your task is to translate G. Wiz's code name. Generally, the society creates code names based on what a member fills out on their membership application. Given this information, they've provided the hint in the form of a question, the answer to which is G. Wiz's code name:

> What is a gator's favorite programming language?


## Evaluation

### `DecoderRing.java`

- [ ] Contains no:
    * `TODO` markers
    * `{Your Name Here}` markers
- [ ] Uses single-line comments to mark each letter shift and the final output (at least `8`)
- [ ] Creates output similar to sample below
- [ ] Uses identifiers of the `char` type to hold each character
- [ ] Stores the length of the word read from the `Scanner` in an `int` called `key`
- [ ] _Initializes_ and uses a `String` called `codeName` to store the decoded letters
- [ ] Adopts the "casting" strategy to shift characters _back_ 7 letters
- [ ] Passes `gradle build`
- [ ] Passes `gradle run`

```
Welcome to the club, {CODE NAME}
```

### `reflection.md`

- [ ] Contains no:
    * `TODO` markers
    * `{Your Name Here}` markers
- [ ] Contains 250 words
- [ ] Written in correct markup (passes `mdl`)
- [ ] Responds to all questions

### Repository

- [ ] Has at least 3 `commit`s

## Accepting the assignment

- [ ] Log into the `#labs` channel in our class [Slack](https://cmpsc-100-02-sp-2020.slack.com)
- [ ] Click the link provided for the lab assignment and accept it in GitHub classroom
- [ ] Once the assignment finishes building, click the link to go to your personal repository assignment

## "Cloning" a repository

### Using the correct download link

- [ ] On this repository's page, click the `Clone or download` button in the upper right hand corner
* You may need to scroll up to see it
- [ ] In the upper right corner of the box that appears, click `Use SSH`
- [ ] Copy the link that appears in the textbox below the phrase "Use a password with a protected key."

### Cloning

- [ ] Type `ls` in your terminal window
* You should be in your `CMPSC100` directory
- [ ] Change directories (`cd`) to your `Labs` folder
- [ ] Once in the labs folder, "clone" the repository using the link copied above
* If I (the instructor) were to clone my own repository, I'd enter (your link will look different):
```
git clone git@github.com:allegheny-college-cmpsc-100-spring-2020/cmpsc-100-spring-2020-lab-05-dluman
```

## GatorGrader

### A note about `gradle`

`gradle` is a program which manages our program's many moving parts. It coordinates building, testing, compiling, and running our code -- tasks that will become more complex over the course of the semester in direct proportion to the complexity of our programs. There are three "tasks" that we will use extensively in this course.

#### `gradle build`

`gradle build` compares code against a set of convetions ("best practices") for creating legible code. There are many different standards for doing this, but our department chooses to follow the [Google Style Guide for the Java language](https://google.github.io/styleguide/javaguide.html). This includes such rules as:

* Each "level" of code being indented by 2 spaces
* Not using single-letter identifiers
* Enforcing consistent use of "Javadoc" (and other) comments
* ... and more!

These kinds of standard make reading code much easier, and help folks like our Technical Leaders (and me) read your code to figure out where something isn't going as planned.

#### `gradle run` (and its variants)

`gradle run` (and its counterpart `gradle -q --console plain run`) compile and run our Java programs. Once again, this will become more handy when we start to build projects that require _multiple_ files.

#### `gradle grade`

`gradle grade` runs the GatorGrader application. This application uses grading standards _specific to an assignment_. This means that the grading files created when you accept an assignment are the same ones by which I will evaluate your work: _once you've cloned an assignment, they do not change_.

You will use this command to grade your work before you turn it in, enabling you to know before I grade it what your grade will be.

#### Running GatorGrader directly on `container` start

- [ ] `cd` to your `CMPSC100` folder
- [ ] Locate the `cmpsc-100-spring-2020-lab-02` folder and `cd` to it.
    * Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
- [ ] To make sure you're in the right repository, type `pwd` and press `Enter`
    * If you recieve the expected path, you're in the right place!

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

## Submitting the assignment/saving progress

The GitHub platform is a place to store your work. So, it makes some sense that should be able to _clone_ (download) from it, and push back (upload) to it. Here, we'll learn this second part.

- [ ] `cd` to your `CMPSC100` folder
- [ ] Locate the `cmpsc-100-spring-2020-lab-05` folder and `cd` to it.

Once in this folder, we need to tell git that there have been changes.

- [ ] Type `git add .` and press `Enter`
* This tells git to look through the _entire_ folder structure for new changes and "stage" them

- [ ] Type `git commit -m "{Commit message}"` to "label" the commit
* This is typically something like `git commit -m "Fixing a typo"` -- the message in quotes should be as descriptive as possible, while still remaining somewhat short

- [ ] To send all changes to the server, type `git push`
- [ ] At the prompt, input the password associated with the `SSH Key` you created earlier in this exercise (yesterday)

Once the process finishes successfully, we're done!