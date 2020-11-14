FROM ubuntu
RUN apt update -y
RUN apt upgrade -y
RUN apt install -y python3
RUN apt install -y python3-pip
RUN pip3 install jupyter notebook
EXPOSE 8888

CMD jupyter notebook --ip 0.0.0.0 --notebook-dir=/config/workspace --allow-root --no-browser 
