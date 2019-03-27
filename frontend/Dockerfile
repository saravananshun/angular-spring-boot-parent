# The builder from node image
FROM node:alpine as builder

RUN apk add --update python py-pip

WORKDIR /app
COPY package*.json /app/
RUN npm install
COPY ./ /app/

ARG configuration=production
RUN npm run build --output-path=dist --configuration=$configuration

FROM nginx:alpine
RUN rm -rf /usr/share/nginx/html/*
COPY nginx.conf /etc/nginx/nginx.conf
COPY --from=builder /app/dist/ /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
