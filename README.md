Deployment: https://dutch-delphinia-adpro12903i32103erj2-514e71dc.koyeb.app/

# Week 2 reflection

## Code quality issues

I fixed the following code quality issues:

* I implemented minimum restrictions for `GITHUB_TOKEN` with the help of StepSecurity.
* I made sure every class has at least one defined constructor.
* I renamed short variable names such as `id`.
* I removed redundant `public` modifiers in my interface's methods.

## CI/CD

I think my current implementation _has_ met the definition of Continuous Integration and Continuous Deployment.

Every time I push changes from my local repo to GitHub, the workflows there will automatically make sure that the code is at least deployable by attempting to build it using Gradle. It also checks the code for code quality issues, such as best practice violations, dubious code style, and error-prone constructs.

Then, Koyeb periodically checks my repo for changes and automatically re-deploys my app if it detects a change; thus, continuous deployment.
