FROM node:10.13-alpine AS builder
COPY . ./DelExDummyApp-UI
WORKDIR /DelExDummyApp-UI
RUN npm i
RUN $(npm bin)/ng build --prod

FROM nginx:1.15.8-alpine
COPY --from=builder /DelExDummyApp-UI/dist/DelExDummyApp-UI/ /usr/share/nginx/html