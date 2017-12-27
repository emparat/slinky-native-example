var transformer = require('metro-bundler/src/transformer')

function transform({ src, filename, options }) {
  options = options || {};
  if (filename.indexOf('fastopt') > -1) {
    return {
      code: src,
      filename
    }
  }
  else {
    return transformer.transform({ src, filename, options })
  }
}

module.exports.transform = transform;
