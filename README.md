Deployment: https://dutch-delphinia-adpro12903i32103erj2-514e71dc.koyeb.app/

# Week 2 reflection

## Code quality issues

I fixed the following code quality issues:

* I implemented minimum restrictions for `GITHUB_TOKEN` with the help of StepSecurity.

## CI/CD

I think my current implementation _has_ met the definition  of Continuous Integration and Continuous Deployment.

Every time I push changes from my local repo to GitHub, the workflows there will automatically make sure that the code is at least deployable by attempting to build it using Gradle.

Then, Koyeb periodically checks my repo for changes and automatically re-deploys my app if it detects a change; thus, continuous deployment.
