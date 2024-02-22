// const url = require('url');

// const urlString = 'http://example.com/path?foo=bar&baz=qux';
// const parsedUrl = url.parse(urlString,true);

// console.log(parsedUrl.pathname);
// console.log(parsedUrl.query);


const url = require('url');
const queryString = require('querystring');
const queryString = 'foo=bar&baz=qux';
const parsedQuery = queryString.parse(queryString);
console.log(parsedQuery);
