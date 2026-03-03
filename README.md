Deployment: https://dutch-delphinia-adpro12903i32103erj2-514e71dc.koyeb.app/

(Note: Deployment is occasionally paused to save my money)

# Week 3 reflection

Here are the SOLID principles I applied to my project:

* **Single responsibility:** Overall, the codebase already demonstrates SRP. Each class is responsible for one thing, and one thing only.
  * `Product` and `Car` are models for products and cars.
  * `ProductRepository` and `CarRepository` serves as a storage model for `Product` and `Car` objects.
  * `ProductService` and `CarService` define methods for manipulating a given repository.
  * `ProductController` defines controllers for the `Product` model.
  * `CarController` extends `ProductController` by adding controllers for the `Car` model.
* **Open-closed principle:** The additions demonstrate an example of OCP. `CarController` is defined as a subclass of the existing `ProductController`. It *extends* `ProductController` adds controllers for the Car model and its corresponding views, without *modifying* the existing methods in `ProductController`.
* **Liskov substitution:** The additions demonstrate an example of LSP. `CarController` is defined as a subclass of the existing `ProductController`. The main advantage here is polymorphism: we can use a `CarController` anywhere where a `ProductController` is expected.
* **Interface segregation:** Currently, ISP does not apply in my codebase. The methods defined by the `ProductService` and `CarService` interfaces are too interrelated; it does not make sense for a client to want to implement one or a few methods but not the rest. Defining separate interfaces for each one would be unnecessarily verbose. The main advantage of ISP would be that clients don't need to implement methods that they don't use, but in this example, not implementing all the methods would just be inappropriate anyway.
* **Dependency inversion:** I modified `CarController` so that it has a `CarService` attribute instead of a `CarServiceImpl`. The main advantage to applying DIP is that this makes the high-level module (`CarController` in this example) independent of the implementation details of the low-level module (here `CarServiceImpl`).

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
