This is a project I thought of when I had to get a new laptop in the middle of taking classes for my computer science degree. 
I didn't relish the idea of immediately installing a bunch of applications, runtimes, libraries, etc on my brand new laptop, just to not need them after I'm done with these classes.

At this point each 'language folder' has a 'base' folder with a Dockerfile, docker-compose.yml, and a workspace folder with a 'helloworld' project.
I put them in a 'base' folder to make it easier to add customized builds like the 'pytorch' build in the _python folder.
The docker-compose file will mount the workspace folder to the container's appropriate location to be used in the respective IDE. 
This will preserve your code beyond the life of the container, and you can take the folders to any machine running docker and easily rebuild your dev environment and mount your source code.

Use 'docker build -t <image name from docker-compose.yml> .' to create images for the respective language build environments

then use 'docker-compose up' to start containerized dev environment

you could replace image name in yml file to with build and path to Dockerfile too. at least in theory I haven't tested it yet because I still like doing somethings manually, and I'm still new to Docker.

Note: if you aren't familiar with Docker and are on windows, you need pro or enterpise windows to be able to use docker.