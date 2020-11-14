Use build files in __docker_builds to create images for the respective language build environments make sure to use -t <image name matching docker-compose file>

then use docker-compose -f <language>.yml up to start containerized dev environment

you could replace image name in yml file to with build and path to Dockerfile too. at least in theory i haven't tested it yet.

current design links all dev environment directories to the _<language name> directories when placed in the user's Documents folder. Change username as appropriate.