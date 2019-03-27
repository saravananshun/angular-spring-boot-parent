# The builder from node image
FROM node:alpine as builder

VOLUME /apps

ARG configuration=production
RUN npm run build --output-path=dist --configuration $configuration

FROM nginx:alpine
RUN rm -rf /usr/share/nginx/html/*
COPY nginx.conf /etc/nginx/nginx.conf
COPY --from=builder dist /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
