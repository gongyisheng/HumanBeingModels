/**
 * 随机生成[len]长度的[radix]进制数
 * @param len
 * @param radix 默认62
 * @returns {string}
 */
function uuid (len, radix = 62) {
  const chars = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'.split('');
  const uuid = [];
  radix = radix || chars.length;

  for (let i = 0; i < len; i++) {
    uuid[i] = chars[0 | Math.random() * radix];
  }

  return uuid.join('');
}

export default uuid;
